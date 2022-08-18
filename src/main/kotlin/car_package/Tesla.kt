package car_package

class Tesla(var t_model:String,var t_color:String, var t_speed :Int):Car(t_model, t_color, t_speed) ,AutoDriving {
    override fun getFuelType(): String {
        return "Electric"
    }
    override fun auto(){
        println("Start Auto Driving,Please!")
    }
}