/**
 * <p>Implement a function that accepts 3 integer values a, b, c.
 * The function should return true if a triangle can be built with the sides of given length and false in any other case.</p>
 * <p>(In this case, all triangles must have surface greater than 0 to be accepted).</p>
 */
#include <iostream>

namespace Triangle
{
    bool isTriangle(long a, long b, long c)
    {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
};

/*int main()
{
    std::cout << std::boolalpha;
    std::cout << Triangle::isTriangle(1, 2, 3);
    return 0;
}*/
