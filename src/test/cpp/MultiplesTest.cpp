#include <igloo/igloo_alt.h>
#include <Multiples.cpp>

using namespace igloo;

Describe(solution_algorithm)
{
    It(should_handle_basic_test_cases)
    {
        Assert::That(Multiples::solution(10), Equals(23));
    }
};

int main()
{
  return TestRunner::RunAllTests();
}