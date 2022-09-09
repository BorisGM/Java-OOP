package p02_ExtendedDatabase;



public class Database {

    private Person[] elements;
    private int elementsCount = 0;
    private int index;


    public Database(Person... people) throws OperationNotSupportedException {
        this.elementsCount = people.length;
        this.setElements(people);
        this.index = elementsCount - 1;
    }

    public void add(Person person) throws OperationNotSupportedException {
        if (person == null) {
            throw new OperationNotSupportedException();
        }

        this.elements[++index] = person;
        this.elementsCount++;
    }
    public void add(Person person) throws OperationNotSupportedException {
        if (person == null) {
            throw new OperationNotSupportedException();
        }

        this.elements[++index] = person;
        this.elementsCount++;
    }
    public void remove() throws OperationNotSupportedException {
        try {
            this.elements[index--] = null;
            this.elementsCount--;
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new OperationNotSupportedException();
        }
    }




}
