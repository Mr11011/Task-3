package car_package

class BMW(var b_model: String, var b_color:String, var b_speed:Int) : Car(b_model,b_color,b_speed) {
    override fun getFuelType():String{
        return "Gas"
    }

}