/**
 * Created by Puneet on 18-May-16.
 */

function changeContent(){
    //Read the existing content
    var str = document.getElementsByTagName('p')[0].innerHTML
    // reverse it
    var reversedStr = str.split('').reverse().join('');
    // write the reversed content back
    document.getElementsByTagName('p')[0].innerHTML = reversedStr

}
