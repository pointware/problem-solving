# Generate Parentheses
```java
if( open < n ){
    generate(open+1, close)
}
if( close < open ){
    generate(open, close+1)
}
```
generate(1, 0) "(" \
generate(2, 0) "((" \
generate(3, 0) "(((" \

generate(3, 1) "((()" \
generate(3, 2) "((())" \
generate(3, 3) "((()))" \

generate(2, 1) "(()" \
generate(2, 2) "(())" \
generate(3, 2) "(())(" \
generate(3, 3) "(())()" \

call stack이 어떻게 될 것인가를 고민하면 도움이 된다..

            