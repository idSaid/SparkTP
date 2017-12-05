import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Said on 04/03/2017.
  */
object essaicours {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Fr").setMaster("local[2]")
    val sc: SparkContext = new SparkContext(conf)
    val input = sc.textFile("LivreV6ok.txt")
    val lig = input.filter(line => line.contains("France"))
    lig.saveAsTextFile("exo3.txt")
  }
}
