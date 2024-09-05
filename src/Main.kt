import java.util.Scanner //Needed for user input

fun main()
{
    val newSquare : Square = Square("BigSquare")
    var newCircle : Circle = Circle("BigCircle")
    var newTriangle : Triangle = Triangle("BigTriangle")
    var newEqualTri : EquilateralTriangle = EquilateralTriangle("EqualTri")

    val reader = Scanner(System.`in`)

    print("Enter a square length: ")
    val squareLength = reader.nextDouble()
    print("Enter a square height: ")
    val squareHeight = reader.nextDouble()


    print("Enter a radius: ")
    val circleRadius = reader.nextDouble()


    print("Enter side 1 of a triangle: ")
    val sideOne = reader.nextDouble()
    print("Enter side 2 of a triangle: ")
    val sideTwo = reader.nextDouble()
    print("Enter side 3 of a triangle: ")
    val sideThree = reader.nextDouble()


    print("Enter a side for the equilateral triangle: ")
    val equalSide = reader.nextDouble()

    newSquare.setDeminsions(squareLength, squareHeight)
    println(newSquare.name)
    newSquare.printDimensions()
    println(newSquare.getArea())

    println(newCircle.name)
    newCircle.setDimensions(circleRadius)
    newCircle.printDimensions()
    println(newCircle.getArea())

    println(newTriangle.name)
    newTriangle.setDimensions(sideOne, sideTwo, sideThree)
    newTriangle.printDimensions()
    println(newTriangle.getArea())

    println(newEqualTri.name)
    newEqualTri.setDimensions(equalSide)
    newEqualTri.printDimensions()
    println(newEqualTri.getArea())

}