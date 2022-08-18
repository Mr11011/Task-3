package car_package


abstract class Car (var model:String, var color:String, var speed:Int) {

    abstract fun getFuelType():String
}