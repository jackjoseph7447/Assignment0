import kotlin.math.sqrt //Needed for Heron's formula

class EquilateralTriangle(_name: String) : Triangle(_name)
{
    var side : Double = 0.0

    fun setDimensions(_side : Double)
    {
        side = _side
    }

    override fun printDimensions()
    {
        println("Sides length: $side")
        println("Current shape: Equilateral Triangle")
    }

    override fun getArea(): Double
    {
        val s = (side * 3) / 2
        val answer = sqrt((s * (s - side) * (s - side) * (s - side))) //gets square root

        return answer
    }
}