package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person> implements Iterable<E>{
    private List<E> personList = new ArrayList<E>();

    public void add(Person person){
        personList.add((E) person);
    }

    public Person findById(Long id){
        Person result = null;
        for(Person p : personList){
            if(p.getId().equals(id)){
                result = p;
            }
        }
        return result;
    }

    public boolean contains(Person person){
        return personList.contains((E) person);
    }

    public void remove(Person person) {
        if (personList.contains((E)person)) {
            personList.remove((E)person);
        }
    }

    public void removeById(Long id){
        People person = new People();
        Person exists = person.findById(id);
        personList.remove((E)exists);
    }

    public void removeAll(){
        for(Person p : personList){
            personList.remove(p);
        }
    }
    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
      return (Person[]) personList.toArray();
    }

    @Override
    public Iterator<E> iterator() {
        return this.personList.iterator();
    }
}
