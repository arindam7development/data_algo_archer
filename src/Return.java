/**
 * Created by AR277544 on 3/29/2016.
 */
public class Return<E> {

      E data ;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Return(E parameter){
        this.data=parameter;
    }

    public E arin(E d){

        return d;
    }

    public void show(E  d){

        System.out.println(d);
    }


}
