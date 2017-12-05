/**
  * Created by Said on 04/03/2017.
  */

import org.apache.spark._
object compter {

    def main(args: Array[String]){
      val logFile = "fichierLog.txt"
      val conf = new SparkConf().setAppName("appName").setMaster("local[2]")
      val sc = new SparkContext(conf)
      val logData = sc.textFile(logFile,2).cache()
      val numAs = logData.filter(line => line.contains("a")).count()
      val numBs = logData.filter(line => line.contains("b")).count()
      println(s"Lines with a: $numAs, Lines with b: $numBs")
      sc.stop()
    }

}
