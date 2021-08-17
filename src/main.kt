import java.util.*

fun main() {
    val obj=Scanner(System.`in`)
    var size=obj.nextInt()
    var arr=IntArray(size)
    for (i in 0 until  size){
        arr[i]=obj.nextInt()
    }
    var count=0
    for (i in 0 until size){
        if (arr[i]==-100) continue
        count=0
        for (j in i+1 until size){
            if (arr[i]==arr[j]){
                ++count
                arr[j]=-100
                break
            }

        }
        if (count==0) println(arr[i])
    }
}