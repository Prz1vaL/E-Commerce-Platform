package com.stacs.group3.ShoppingSystemApp.serviceTests;
import com.stacs.group3.ShoppingSystemApp.service.ProductService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {
    ProductService productService = new ProductService();

    @BeforeEach
    public void setup() {


        productService.addProduct("1", "Harry Potter: Philosopher's Stone",
                "The first novel in the Harry Potter series and Rowling's debut novel, " +
                        "it follows Harry Potter, a young wizard who discovers his magical heritage on his eleventh birthday, " +
                        "when he receives a letter of acceptance to Hogwarts School of Witchcraft and Wizardry. " +
                        "Harry makes close friends and a few enemies during his first year at the school and with the help of his friends, " +
                        "Ron Weasley and Hermione Granger, he faces an attempted comeback by the dark wizard Lord Voldemort, " +
                        "who killed Harry's parents, but failed to kill Harry when he was just 15 months old.",
                "J.K. Rowling", "12.99", "100", "Fantasy", "mj456");

        productService.addProduct("2", "A Man Called Ove",
                "A Man Called Ove is a novel by Swedish writer Fredrik Backman published in Swedish by Forum in 2012. " +
                        "The novel was published in English in 2013 and reached the New York Times Best Seller list 18 months " +
                        "after its publication and stayed on the list for 42 weeks",
                "Fredrik Backman", "6.99", "200", "Novel", "mj456");
    }

    @Test
    public void testAddProduct() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "50", "Nonfiction", "jj789"),
                "Product ID cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "50", "Nonfiction", "jj789"),
                "Product Name cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "",
                        "Tara Westover", "9.99", "50", "Nonfiction", "jj789"),
                "Product Description cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "", "9.99", "50", "Nonfiction", "jj789"),
                "Author cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "", "50", "Nonfiction", "jj789"),
                "Product Price cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "", "Nonfiction", "jj789"),
                "Product Quantity cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "50", "", "jj789"),
                "Product Category cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "50", "Nonfiction", ""),
                "Seller Username cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "0", "Nonfiction", "jj789"),
                "Product Quantity cannot be 0");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara 1Westover", "9.99", "50", "Nonfiction", "jj789"),
                "Author cannot contain numbers");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99 pounds", "50", "Nonfiction", "jj789"),
                "Product Price cannot contain letters");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "50 books", "Nonfiction", "jj789"),
                "Product Quantity cannot contain letters");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("3", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "50", "Nonfiction1", "jj789"),
                "Product Category cannot contain numbers");

        assertThrows(IllegalArgumentException.class,
                () -> productService.addProduct("2", "Educated",
                        "Educated is a memoir by the American author Tara Westover. " +
                                "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                                "and emphasizes the importance of education in enlarging her world. " +
                                "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                                "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                                "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                        "Tara Westover", "9.99", "50", "Nonfiction", "jj789"),
                "Product ID already exists");

        productService.addProduct("3", "Educated",
                "Educated is a memoir by the American author Tara Westover. " +
                        "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                        "and emphasizes the importance of education in enlarging her world. " +
                        "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                        "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                        "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                "Tara Westover", "9.99", "50", "Nonfiction", "jj789");
        assertEquals(productService.viewAllProducts().size(), 3);
    }

    @Test
    public void testSearchProductByName() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByName(""),
                "Product Name cannot be empty");

        assertEquals(productService.searchProductByName("A Man Called Ove").size(), 1);

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByName("A Man Called Ove"),
                "No products available");
    }

    @Test
    public void testSearchProductByCategory() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByCategory(""),
                "Product Category cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByCategory("123"),
                "Product Category cannot be empty");

        assertEquals(productService.searchProductByCategory("Fantasy").size(), 1);

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByCategory("Fantasy"),
                "No products available");
    }

    @Test
    public void testSearchProductByAuthor() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByAuthor(""),
                "Product Author cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByAuthor("123"),
                "Product Author cannot contain numbers");

        assertEquals(productService.searchProductByAuthor("J.K. Rowling").size(), 1);

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.searchProductByAuthor("J.K. Rowling"),
                "No products available");
    }

    @Test
    public void testViewAllProducts() {
        assertEquals(productService.viewAllProducts().size(), 2);

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.viewAllProducts(),
                "No products available");
    }

    @Test
    public void testDeleteProduct() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.deleteProduct("", "mj456"),
                "Product ID cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.deleteProduct(".1", "mj456"),
                "Product ID can only contain alpha-numeric characters");

        assertThrows(IllegalArgumentException.class,
                () -> productService.deleteProduct("100", "mj456"),
                "Product ID does not exist or you do not have the permission to delete this product.");

        assertThrows(IllegalArgumentException.class,
                () -> productService.deleteProduct("1", "jj456"),
                "Product ID does not exist or you do not have the permission to delete this product.");

        productService.deleteProduct("1", "mj456");
        assertEquals(productService.viewAllProducts().size(), 1);

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.deleteProduct("1", "mj456"),
                "No products available");
    }

    @Test
    public void testViewSellerProducts() {
        productService.addProduct("3", "Educated",
                "Educated is a memoir by the American author Tara Westover. " +
                        "Westover recounts overcoming her survivalist Mormon family in order to go to college, " +
                        "and emphasizes the importance of education in enlarging her world. " +
                        "She details her journey from her isolated life in the mountains of Idaho to completing a PhD program " +
                        "in history at Cambridge University. She started college at the age of 17 having had no formal education. " +
                        "She explores her struggle to reconcile her desire to learn with the world she inhabited with her father.",
                "Tara Westover", "9.99", "50", "Nonfiction", "jj789");

        assertEquals(productService.viewSellerProducts("jj789").size(), 1);
        assertEquals(productService.viewSellerProducts("mj456").size(), 2);

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.viewSellerProducts("jj789"),
                "No products available");
    }

    @Test
    public void testCheckValidationToUpdate() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.checkValidationToUpdate("mj456", ""),
                "Product ID cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.checkValidationToUpdate("mj456", ".1"),
                "Product ID can only contain alpha-numeric characters");

        assertThrows(IllegalArgumentException.class,
                () -> productService.checkValidationToUpdate("mj456", "100"),
                "Product ID does not exist or you do not have the permission to delete this product.");

        assertThrows(IllegalArgumentException.class,
                () -> productService.checkValidationToUpdate("jj456", "1"),
                "Product ID does not exist or you do not have the permission to delete this product.");


        assertTrue(productService.checkValidationToUpdate("mj456", "1"));

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.checkValidationToUpdate("1", "mj456"),
                "No products available");
    }

    @Test
    public void testUpdateProductName() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductName("1", ""),
                "Product Name cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductName("1", "123"),
                "Product Name cannot contain numbers");

        productService.updateProductName("1", "Educated");
        assertEquals(productService.searchProductByName("Educated").size(), 1);
    }

    @Test
    public void testUpdateProductDescription() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductDescription("1", ""),
                "Product Description cannot be empty");

        productService.updateProductDescription("1", "The first novel in the Harry Potter series");
        assertEquals(productService.viewAllProducts().get("1").getDescription(),
                "The first novel in the Harry Potter series");
    }

    @Test
    public void testUpdatePrice() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductPrice("1", ""),
                "Product Price cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductPrice("1", "10 pounds"),
                "Product Price can only contain numbers");

        productService.updateProductPrice("1", "15");
        assertEquals(productService.viewAllProducts().get("1").getPrice(), "15");
    }

    @Test
    public void testUpdateProductQuantity() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductQuantity("1", ""),
                "Product Quantity cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductQuantity("1", "10 books"),
                "Product Quantity can only contain numbers");

        productService.updateProductQuantity("1", "600");
        assertEquals(productService.viewAllProducts().get("1").getQuantity(), "600");
    }

    @Test
    public void testUpdateProductCategory() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductCategory("1", ""),
                "Product Category cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductCategory("1", "123"),
                "Product Category cannot contain numbers");

        productService.updateProductCategory("1", "fiction");
        assertEquals(productService.viewAllProducts().get("1").getCategory(), "fiction");
    }

    @Test
    public void testUpdateProductAuthor() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductAuthor("1", ""),
                "Product Author cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductAuthor("1", "123"),
                "Product Author cannot contain numbers");

        productService.updateProductAuthor("1", "Tara");
        assertEquals(productService.viewAllProducts().get("1").getAuthor(), "Tara");
    }

    @Test
    public void testUpdateProductAfterOrder() {
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductAfterOrder("", 10),
                "Product ID cannot be empty");

        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductAfterOrder(".100", 10),
                "Product ID can only contain alpha-numeric characters");

        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductAfterOrder("100", 10),
                "Product ID does not exist");

        productService.updateProductAfterOrder("1", 10);
        assertEquals(productService.viewAllProducts().get("1").getQuantity(), "90");

        productService.wipeAll();
        assertThrows(IllegalArgumentException.class,
                () -> productService.updateProductAfterOrder("1", 10),
                "No products available");
    }
}
