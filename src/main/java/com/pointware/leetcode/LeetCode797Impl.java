package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode797;

import java.util.ArrayList;
import java.util.List;

public class LeetCode797Impl implements LeetCode797 {
    @Override
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // row -> node
        // col -> edge
        return DFS(graph, 0, new ArrayList<>());
    }

    public List<List<Integer>> DFS(int[][] graph, int node, List<Integer> arr) {
        List<List<Integer>> result = new ArrayList<>();
        arr.add(node);
        for (var nextNode : graph[node]) {
            result.addAll(DFS(graph, nextNode, arr));
        }
        if (graph.length - 1 == node)
            result.add(new ArrayList<>(arr));
        arr.remove(arr.size() - 1);
        return result;
    }
}
