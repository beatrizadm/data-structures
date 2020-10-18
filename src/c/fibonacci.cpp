#include <iostream>

using namespace std;

int main()
{
    int qtdTermos = 10, termo01 = 0, termo02 = 1;
    cout << "Primeiros " << qtdTermos <<" termos: "<<endl;
    for(int i=1; i<= qtdTermos; i++){
        cout<< termo01<<endl;

        int soma = termo01 + termo02;

        termo01 = termo02;
        termo02 = soma;
    }

    return 0;
}