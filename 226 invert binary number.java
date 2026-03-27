// time : O(n), n = no of nodes in the tree
        // space : O(n), n = height of the tree - basically stack space

        // dfs breaking point
        if(root == null) return null;

        // recursion stack
        TreeNode leftRoot = invertTree(root.left);
        TreeNode rightRoot = invertTree(root.right);

        // swap
        root.left = rightRoot;
        root.right = leftRoot;

        return root;
