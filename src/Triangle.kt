import kotlin.math.sqrt //Needed for Heron's Formula

open class Triangle(_name: String) : Shape(_name)
{
    var sideA : Double = 0.0
    var sideB : Double = 0.0
    var sideC : Double = 0.0

    fun setDimensions(_sideA : Double, _sideB : Double, _sideC : Double)
    {
        sideA = _sideA
        sideB = _sideB
        sideC = _sideC
    }

    override fun printDimensions()
    {
        println("SideA: $sideA")
        println("SideB: $sideB")
        println("SideC: $sideC")
        println("Current shape: Triangle")
    }

    override fun getArea(): Double
    {
        val s = (sideA + sideB +sideC) / 2
        val answer = sqrt((s * (s - sideA) * (s - sideB) * (s - sideC))) //Gets the square root

        return answer
    }
}