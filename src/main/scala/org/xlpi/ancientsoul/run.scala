package org.xlpi.ancientsoul

import scala.annotation.tailrec


object Run extends App {

  def textFormatter(inputText: String, lineSizeLimit: Int): String = {
    val words = inputText.split(" ")

    @tailrec
    def loop(counterOfSymbols: Int, counterOfWords: Int, acc: Array[String]): Array[String] = {

      if (counterOfWords == words.length) acc
      else {
        val currentItem: String = words(counterOfWords)
        val nextItemLength = if (counterOfWords == (words.length - 1)) lineSizeLimit else words(counterOfWords + 1).length
        val lineCurrentLength = counterOfSymbols + currentItem.length
        val next: Next =
          if (lineCurrentLength <= lineSizeLimit) {
            Next(item = if ((counterOfSymbols + 1 + currentItem.length + nextItemLength) > lineSizeLimit) currentItem else {
              currentItem + " "
            }, counter = lineCurrentLength + 1, counterOfWords + 1)
          }
          else {
            Next(item = "\n", counter = 0, counterOfWords)
          }
        loop(next.counter, next.pointer, acc :+ next.item)
      }

    }

    loop(0, 0, Array[String]()).mkString
  }


}
