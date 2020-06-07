import java.util.Scanner

class Calculate()
{
    val reader = Scanner(System.`in`)
    fun hello()
    {
        println("---------Welcome, All Kotlin Enthusiasts----------")
        println("\n It's time to calculate Areas.....")
    }

    fun area_Rect()
    {
        println("\n_________Enter the Details of the Rectangle_________")

        print("\nEnter lenght : ")
        var l :Double? = reader.nextDouble()

        print("Enter breadth : ")
        var b :Double? = reader.nextDouble()

        println("\nYou entered lenght as : $l cm" )
        println("You entered breadth as : $b cm")

        val Rect_area = { l1 : Double ,b1 : Double -> l1*b1}
        println("\n-------->>>>The Area of Rectangle is : ${Rect_area(l!!,b!!)} cm")
    }

    fun area_Circ(pi:Double)
    {
        println("\n_________Enter the Details of the Circle_________")

        print("\nEnter radius : ")
        var r :Double? = reader.nextDouble()

        println("\nYou entered radius as : $r cm" )

        val Rect_circ = { rad: Double ,const : Double -> const*rad*rad}
        println("\n-------->>>>The Area of Circle is : ${Rect_circ(r!!,pi)} cm")
    }
}

fun main(args: Array<String>) {

    val use = Calculate()
    use.hello()
    use.area_Rect()
    use.area_Circ(pi=3.14)

}
