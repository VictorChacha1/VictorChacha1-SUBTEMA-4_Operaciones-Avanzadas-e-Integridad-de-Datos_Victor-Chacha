#include <iostream>
#include <string>
using namespace std;

int main() {
    string nombres[5] = {"Teclado", "Mouse", "Monitor", "Auriculares", "Microfono"};
    double precios[5] = {15.50, 8.75, 120.00, 25.00, 45.20};
    string productoBuscar;
    bool encontrado = false;

    cout << "Ingrese el nombre del producto a buscar: ";
    cin >> productoBuscar;

    for (int i = 0; i < 5; i++) {
        if (nombres[i] == productoBuscar) {
            cout << "\nProducto encontrado: " << nombres[i] << endl;
            cout << "Precio correspondiente: $" << precios[i] << endl;
            encontrado = true;
            break; 
        }
    }

    if (!encontrado) {
        cout << "\nEl producto no existe en el inventario." << endl;
    }

    return 0;
}
