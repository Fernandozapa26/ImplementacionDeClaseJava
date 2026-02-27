package main.java.com.example;

public class Product {
    private String id; //identificador unico
    private  String name; // nombre del producto
    private  Double price; //Precio unitario
    private  int stock; //cantidad de inventario

    //-----------Metodos getter--------------
    public String getId() {
        return id;
    }
    public String getName(){
    return name;
    }
    public Double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }

    //------------Metodos setter-------------

    public void setId (String id){ //revisar si se puede actualizar o no el id eliminar este metodo
        this.id=id;
    }
    public void setName (String name){
        this.name=name;
    }
    //Validacion agregada a price
    public void setPrice (Double price){
        if (price >=0){ //verificamos que no sea negativo
            this.price=price; // si es valido, lo asigna.
        }else{
            System.out.println("El price no puede ser negativo");
        }
    }
    //Validacion agregada a stock
    public void setStock (int stock){
        if(stock >=0){  //verificamos que no sea negativo
            this.stock=stock;  // si es valido, lo asigna.
        }else{
            System.out.println("El stock no puede ser negativo");
        }

    };

    public String toString(){
        return"Producto [ Id: "+id + " Nombre :"+ name + "Precio: "+price+ "Stock :" +stock +"]";
    }







}
