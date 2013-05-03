package obj



abstract class IdGenObject() {

  var guid : Int = 0
  var name : String = null
  var superior : IdGenObject = null
  var subordinate : IdGenObject = null
  var delegate : IdGenObject = null
  var credential : Credential = null
  
}