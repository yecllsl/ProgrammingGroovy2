/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
***/
def totalSelectValues(n, closure) {//定义totalSelectValues函数，接受闭包作为参数
  total = 0
  for(i in 1..n) {
    if (closure(i)) { total += i }
  }
  total
}
print "Total of even numbers from 1 to 10 is "
println totalSelectValues(10) { it % 2 == 0 }//把“it % 2 == 0”传递进去

def isOdd = { it % 2 != 0}//预定义了闭包
print "Total of odd numbers from 1 to 10 is "
println totalSelectValues(10, isOdd)
