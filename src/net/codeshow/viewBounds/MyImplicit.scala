package net.codeshow.viewBounds

object MyImplicit {

  implicit def person3toOrderedPerson3(person3: Person3)=new Ordered[Person3]{
    override def compare(that: Person3): Int = {
      person3.age - that.age
    }
  }

}
