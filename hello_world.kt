fun main() {
    fun calculate(action: String, one: Int, two: Int): Int {
        var result = -1
        when(action){
            "+" -> result = one + two
            "-" -> result = one - two
            "*" -> result = one * two
            "/" -> result = one / two
            else -> result = -1
        }
        return result
    }
    print(calculate("/",1,1))
}
