package homeworks.homework8;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {

        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void extend() {
        int[] array1 = new int[array.length + 10];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;

    }

    int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong Index");
            return -1;
        }
        return array[index];
    }

    void print() {
        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //ջնջել մասիվի index-երորդ էլեմենտը
    //եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("No such element");
            return;
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;

    }


    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
//Հին արժեքը կկորի
//եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {
        if (index < 0 || index > size) {
            return;
        }
        for (int i = 0; i < size; i++) {
            array[index] = value;

        }
    }
    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
//Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("No such element");
            return;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
    }

    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        if (value >= 0 && value <= size) {
            return true;
        }
        return false;
    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
//եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
            return -1;
        }
    }
