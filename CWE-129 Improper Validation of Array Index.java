        
public class account {
    public String getValue(int index) {
        return array[index];
    }

    private void buildList ( int untrustedListSize ){
        if ( 0 > untrustedListSize ){
        die("Negative value supplied for list size, die evil hacker!");
        }
        Widget[] list = new Widget [ untrustedListSize ];
        list[0] = new Widget();
    }

    // Method called from servlet to obtain product information
    public String displayProductSummary(int index) {
    String productSummary = new String("");
    
    try {
    String product = getProductSummary(index);
    
    
    } catch (Exception ex) {
        System.out.println(productSummary);
    }
    
    return productSummary;
    }
    
    public String getProductSummary(int index) {
    return products[index];
    }

}