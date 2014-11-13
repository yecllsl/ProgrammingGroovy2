/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
***/
class Car {
  def miles = 0
  final year
  
  Car(theYear) { year = theYear }
}

Car car = new Car(2008)

println "Year: $car.year"
println "Miles: $car.miles"
println  'Setting miles'//miles可以设置
car.miles = 25
println "Miles: $car.miles"
