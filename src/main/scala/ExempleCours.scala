/*
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.clustering.KMeans
import org.apache.spark.mllib.linalg.Vectors

/**
  * Created by Said on 04/03/2017.
  */
object ExempleCours {
  def main(args: Array[String]){
    val conf = new SparkConf().setAppName("pp").setMaster("local[2]")
    val sc: SparkContext = new SparkContext(conf)
    val donnees1 = sc.textFile("TP.txt")
    val donnees = donnees1.map(s => Vectors.dense(s.split(' ').map(_.toDouble)))
    donnees.saveAsTextFile("donneeAvantKmeans.txt")
    val nbClusters=3
    val nbIterations=10
    val clus=KMeans.train(donnees, nbClusters, nbIterations)
    val indices = clus.predict(donnees)
    indices.saveAsTextFile("VraiRes")
  }
}
*/
