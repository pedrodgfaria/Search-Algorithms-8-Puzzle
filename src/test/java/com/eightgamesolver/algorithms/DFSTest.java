package com.eightgamesolver.algorithms;

import com.eightgamesolver.ValidConfigs;
import com.eightgamesolver.exceptions.Exceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DFSTest {

    @Test
    void dfsConfig1() throws Exceptions.InvalidPath {
        ValidConfigs validConfig1 = ValidConfigs.getValidConfig1();
        int[] initialState = validConfig1.getInitialState();
        int[] finalState = validConfig1.getFinalState();
        String solutionPath = new DFS(initialState, finalState).getSolutionPath();
        Assertions.assertEquals(
            "RULLDRRULLDRRULLDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLUURRDLLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLDRRULLURRDLLDRRULLURRDLLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURDRULLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLUURDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRULLDRRDLLURRDLLUURRDLLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRDRUULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLUURRDDLLURRDLLURRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLUURDRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDDRRULLURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLURDLLURRDLURDLLURRDLLUURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLURDLLURRDLLUURRDLLDRRULDRULDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLDRRULLURDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLUURDRDLLURRULLDDRRULLDRRULLURRDLLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRULLDRRDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLUURRDLLDRRULLDRRUULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLUURDRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLUURRDLDRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLUURRDLLDRRULLDRRUULLDRRDLLURRULLDDRRULLDRRULLDRRULLDRRULLDRRUULLDRRDLLURRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRULLDRRDLLURRDLLUURRDDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURDRUULLDRRDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLURULLDRRDLLURRDLLUURRDLLDRRULLDRURULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLURRULLDRRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLUURRDLLURDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLUURRDLLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLUURRDLLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDDRRULLDRRULLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRULLDRRDLLUURDRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLURDLLURRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRULLDRRDLLUURRDLLDRRULLDRRULLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRDRUULLDRRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLUURRDLLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLUURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULDRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLUURDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLURDLLURRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLURDLLURRDLLUURRDLLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDDRRULLDRRULLURRDDLLURRDLLURRDLLURRDLLURRDLLUURDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLUURRDLLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLUURRDLLDRRULLURRDLLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULDRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLURULLDRRDLLUURRDLLDRRUULLDDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRRUULLDDRRULLDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRULLDRRDLURDLLURRDLURDLLURRDLLUURRDLLDRRULLDRRULLDRURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLURDLLURRDLLUURRDLLDRRULLDRRUULLDRRDLLURRDLLUURRDLLDRRULLURDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRULLDRRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRULDRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDDRRULLDRRULLURRDLLDRRULDRULLDRRULLURRDLLDRRULLDRRULLDRRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRULLDRRDLLURDRUULLDRRULDRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLUURDRDLLURRULLDRRDLURDLLURRDLLURRDLLURRDLLURRULLDRRDLURDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLDRRULLURRDDLLURRDLLUURRDLLURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURDRUULLDRRDLLUURRDLLDRURULLDRRDLLURRULLDRRDLLURRDLLUURRDDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURDRUULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURDRUULLDDRRULLDRRULDRULLDRRULLURDRDLLURRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULDRDLLURRDLLURRDLLURRDLLURRDLURDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRULLDRRDLLURRDLLURRDLLURRDLLUURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDDRRULLDRRUULLDRRDLLUURRDDLURDLLURRULLDRRDLLURRDLLUURRDLLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULDRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDRRDLLURRDLLURRDLLURRDLLURRDLURDLLURRDLLURRULLDDRRULLURRDLLDRRULLDRRULLDRRULLDRRULLDRURDLLURRDLLURRULLDR",
            solutionPath);
        Assertions.assertEquals(17463, solutionPath.length());
    }
}
