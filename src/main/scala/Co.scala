import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Said on 04/03/2017.
  */
object Co {
  def main(args: Array[String]){
    val conf = new SparkConf().setAppName("CW").setMaster("local[2]")
    val sc: SparkContext = new SparkContext(conf)
    val input = sc.textFile("LivreV6ok.txt")
    val x = input.flatMap(line => line.split(" "))
    //println("xxxxxxxxx")
    //x.saveAsTextFile("x.txt")
    val y = x.map(word => (word,1)).reduceByKey{case(x,y) => x + y}
    //println("xxxxxxxxx")
    //y.saveAsTextFile("y.txt")
    //y.reduceByKey{
    //  case(x,y) => x + y
    //}
    y.saveAsTextFile("exoNouveau.txt")
  }
}
