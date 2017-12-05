import org.apache.spark._
import scala.math.random
/**
  * Created by Said on 04/03/2017.
  */
object Prog {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("x").setMaster("local[2]")
    val sc: SparkContext = new SparkContext(conf)
    val sl = if(args.length > 0) args(0).toInt else 3
    val n = 100000 * sl
    val slices=4
    val count = sc.parallelize(1 to n, slices).map{
      i => val x = random * 2 - 1
          val y = random * 2 - 1
          if (x * x + y * y < 1)1 else 0
    }.reduce(_+_)
    println("x="+ 4.0 * count/n)
    sc.stop()
  }
}
