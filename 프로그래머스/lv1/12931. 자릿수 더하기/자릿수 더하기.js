function solution(n)
{
    var sum = 0;
    for ( var num of n.toString() ) {
        sum += parseInt(num);
    }
   
    return sum;
}