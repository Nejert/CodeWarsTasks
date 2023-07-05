#include <igloo/igloo_alt.h>
#include <Triangle.cpp>

using namespace igloo;

Describe(TriangleTests)
{
    It(Zero_ReturnsFalse)
    {
        Assert::That(Triangle::isTriangle(0,0,0),IsFalse());
        Assert::That(Triangle::isTriangle(0,1,2),IsFalse());

    }

    It(Negative_ReturnsFalse)
    {
        Assert::That(Triangle::isTriangle(-17,15,20),IsFalse());
        Assert::That(Triangle::isTriangle(-17,-15,20),IsFalse());
    }


    It(ValidTriangles_ReturnsTrue)
    {
        Assert::That(Triangle::isTriangle(15,17,20),IsTrue());
        Assert::That(Triangle::isTriangle(10,10,10),IsTrue());
        Assert::That(Triangle::isTriangle(10,5,10),IsTrue());

    }

    It(InvalidTriangles_ReturnsFalse)
    {
        Assert::That(Triangle::isTriangle(3,2,1),IsFalse());
        Assert::That(Triangle::isTriangle(10,10,20),IsFalse());
    }
};

int main()
{
  return TestRunner::RunAllTests();
}