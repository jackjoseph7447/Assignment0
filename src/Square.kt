class Square(_name: String) : Shape(_name)
{
    var length : Double = 0.0
    var height : Double = 0.0

    fun setDeminsions(_length : Double, _height : Double)
    {
        length = _length
        height = _height
    }

    override fun printDimensions()
    {
        println("Height: $height")
        println("Length: $length")
        println("Current shape: Square")
    }

    override fun getArea(): Double
    {
        return length * height
    }
}