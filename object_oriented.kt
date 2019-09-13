fun main() {
    class Batch4(var strength:Int){

        fun listen(){
            print("Class is listening...")
        }

        fun studying(){
            print("Class is studying")
        }
    }

    var object1 = Batch4(123)
    print(object1.strength)
}
