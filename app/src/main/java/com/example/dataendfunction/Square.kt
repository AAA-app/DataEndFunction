package com.example.dataendfunction

class Square(w: Double, h: Double.Companion, override var width: Any, override var height: Any): Shape (w= Double, h= Double, W = Int){
    override fun getArea(): Double {
        return width*height
    }
}

private operator fun Any.times(height: Any): Double {
TODO()
}
