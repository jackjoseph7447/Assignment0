class Circle(_name: String) : Shape(_name)
{
    var radius : Double = 0.0
    val pi : Double = 3.14

    fun setDimensions(_radius : Double)
    {
        radius = _radius
    }

    override fun printDimensions()
    {
        println("Radius: $radius")
        println("Current shape: Circle")
    }

    override fun getArea(): Double
    {
        return pi * radius * radius
    }
}