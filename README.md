# Fibonacci

## 課題

Javaで指定した値までのFibonacci数列の各項を出力するプログラムを作成してください．
Fibonacci数列とは，次の漸化式で求められる数列です．

![recurrence formula](https://latex.codecogs.com/svg.latex?\inline&space;fibonacci(n)&space;=&space;\begin{cases}&space;1&space;&&space;n&space;=&space;1&space;\\&space;1&space;&&space;n&space;=&space;2&space;\\&space;fibonacci(n&space;-&space;1)&space;&plus;&space;fibonacci(n&space;-&space;2)&space;&&space;n&space;>&space;2&space;\end{cases})

## 条件

* コマンドライン引数で与えられた項までのFibonacci数列を出力してください．
    * コマンドライン引数に何も与えられなかった場合は，10項目までのFibonacci数列を出力してください．
* `Fibonacci.java`に書かれている`run`の中身は変更してはいけません．
* 適切に`main`メソッドを作成してください．
* `run`メソッドから呼び出している3つのメソッド（`parseMax`, `fibonacciList`, `printList`）を適切に作成してください．

## 実行例

### コマンドライン引数が与えられなかった場合

```sh
$ java Fibonacci # <- 10項目まで出力する．
1
1
2
3
5
8
13
21
34
55
```

### コマンドライン引数が与えられた場合

```sh
$ java Fibonacci 5 # <- 5項目まで出力する．
1
1
2
3
5
```

### コマンドライン引数が複数個与えられた場合

```sh
$ java Fibonacci 2 3 5 7 11 # <- 最初に与えられ2でFibonacci数列を出力する．
1
1
```
