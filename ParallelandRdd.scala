	scala> val rng100 = 1 to 100
	rng100: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)

	scala> val parrng100=rng100.par
	parrng100: scala.collection.parallel.immutable.ParRange = ParRange(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)


	scala> import scala.collection.parallel.immutable.ParVector
	import scala.collection.parallel.immutable.ParVector

	scala> val pvec200=ParVector.range(0,200)
	pvec200: scala.collection.parallel.immutable.ParVector[Int] = ParVector(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, ... 
	
	
  scala> import scala.util.Random
import scala.util.Random

scala> val bigRng = scala.util.Random.shuffle(1 to 100000)
bigRng: scala.collection.immutable.IndexedSeq[Int] = Vector(90706, 2445, 20607, 71851, 45637, 22899, 15442, 30990, 68155, 26534, 37306, 35511, 33905, 57324, 53421, 95506, 65522, 91693, 72570, 10481, 23511, 26907, 50195, 53811, 36069, 20486, 17328, 82734, 97636, 51923, 97695, 91427, 50212, 14194, 51575, 71969, 50493, 87689, 54792, 94288, 34801, 49898, 70769, 46159, 38033, 51222, 2797, 17369, 13418, 79202, 48382, 57710, 8718, 87122, 10987, 40181, 97913, 70994, 43798, 14073, 7643, 2727, 27398, 93200, 69378, 31877, 54, 74164, 63190, 18490, 74273, 77090, 78217, 70243, 39811, 28660, 79803, 93471, 70199, 57746, 52380, 34973, 18085, 95049, 48694, 5406, 27601, 94146, 37694, 27962, 43675, 92554, 36330, 75843, 67235, 89905, 55507, 41094, 2893, 50094, 72719, 5154, 21752, 63396, 76378, 55349, 63080,...
scala> val bigPRng= sc.parallelize(bigRng)
bigPRng: org.apache.spark.rdd.RDD[Int] = ParallelCollectionRDD[0] at parallelize at <console>:27

scala> bigPRng
res0: org.apache.spark.rdd.RDD[Int] = ParallelCollectionRDD[0] at parallelize at <console>:27

scala> bigPRng.mean
[Stage 0:>                                                          (0 + 0) / 4]18/03/02 15:53:31 WARN TaskSetManager: Stage 0 contains a task of very large size (102 KB). The maximum recommended task size is 100 KB.
res1: Double = 50000.500000000095

scala> bigPRng.min
18/03/02 15:54:56 WARN TaskSetManager: Stage 1 contains a task of very large size (102 KB). The maximum recommended task size is 100 KB.
res2: Int = 1

scala> bigPRng.max
18/03/02 15:54:59 WARN TaskSetManager: Stage 2 contains a task of very large size (102 KB). The maximum recommended task size is 100 KB.
res3: Int = 100000

scala> bigPRng.popStdev
18/03/02 15:55:17 WARN TaskSetManager: Stage 3 contains a task of very large size (102 KB). The maximum recommended task size is 100 KB.
res4: Double = 28867.51345803792