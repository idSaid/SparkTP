import scala.math.random
import org.apache.spark._

object Prog1 {
  def main(args: Array[String]){
    val conf = new SparkConf().setAppName("Prog1").setMaster("local[2]")
    val sc: SparkContext = new SparkContext(conf)
    val x = sc.parallelize(List(0,2,3,8,5))
    val y = sc.parallelize(List(16,17,18,21,22))
    x.cartesian(y).saveAsTextFile("t5.txt")
  }
}
