# Product Management System – Java Console Application (MVC Style)

This is a simple **Product Management System** built in Java using a console-based interface. It allows users to create and view products interactively. The application is structured in a way that follows the MVC (Model-View-Controller) design pattern principles.

## 📁 Project Structure

productmanagement/
│
├── Main.java # Entry point with menu and user interaction
├── Product.java # Product model class (data structure)
├── ProductView.java # Handles displaying product information
├── ProductController.java # Coordinates input and view logic

markdown
Copy
Edit

## 🛠️ Technologies Used

- Java (JDK 8 or above)
- Scanner for console input
- Object-Oriented Programming
- Basic MVC principles

## 🔍 Features

- ✅ Add new products by entering name and price
- ✅ View a list of all created products
- ✅ Clean separation of logic using MVC-style structure
- ✅ Simple and interactive console menu

## 🚀 How to Run

### ✅ Prerequisites

- Java installed (JDK 8+)
- Text editor or Java IDE (like Eclipse, IntelliJ) or terminal

### 💡 Steps

1. Ensure all `.java` files are in the same folder named `productmanagement`:
productmanagement/
├── Main.java
├── Product.java
├── ProductView.java
└── ProductController.java

markdown
Copy
Edit

2. Open terminal/command prompt in the root directory.

3. Compile the code:
```bash
javac productmanagement/*.java
Run the application:

bash
Copy
Edit
java productmanagement.Main
🖥️ Sample Output
mathematica
Copy
Edit
--- Product Management System ---
1. Create product
2. View products
3. Exit
Enter choice: 1
Enter product name: Laptop
Enter product price: 45000

Product created successfully!

--- Product Management System ---
1. Create product
2. View products
3. Exit
Enter choice: 2

Product List:
1. Laptop - ₹45000.0
📌 Use Case
This project is great for Java beginners learning how to:

Structure a console-based app

Work with classes and methods

Implement simple MVC separation

Handle user input and lists
