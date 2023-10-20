#include <iostream>
#include <string>

int main() {
    int cina;
    std::string PN;

    std::cout << "Введіть назву продукту: ";
    std::cin >> PN;
    std::cout << "Введіть ціну продукту: ";
    std::cin >> cina;
    std::cout << " Назва продукту: " << PN << std::endl;
    std::cout << " Ціна продукту: " << cina << "грн. " << std::endl;

    return 0;
}