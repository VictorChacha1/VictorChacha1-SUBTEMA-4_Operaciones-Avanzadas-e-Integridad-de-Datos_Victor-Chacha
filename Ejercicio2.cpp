#include <iostream>
using namespace std;

int main() {
    int numeros[6] = {10, 20, 30, 40, 50, 60};

    cout << "=== MOSTRANDO ELEMENTOS DEL ARREGLO ===" << endl;

    for (int i = 0; i < 6; i++) {
        cout << "Posicion [" << i << "] -> Valor: " << numeros[i] << endl;
    }

    return 0;
}
