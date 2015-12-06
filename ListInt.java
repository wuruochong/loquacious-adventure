public interface ListInt{
    void add (int newVal);  //Adds an int after the last meaningful int
    void add (int index, int newVal); //Adds an int at the specified index, shifts existing ints
    void remove (int index); //Remove int at index, shifts existing ints
    int size(); //Return number of meaningful items in _data
    int get(int index); //Gets value at index
    int set (int index, int newVal); //Sets value at index
}
