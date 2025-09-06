package main

import "fmt"

type BinaryNode struct {
	val   int
	left  *BinaryNode
	right *BinaryNode
}

func insert(node *BinaryNode, val int) *BinaryNode {
	if node == nil {
		return &BinaryNode{val: val}
	}
	if node.val < val {
		node.right = insert(node.right, val)
	} else {
		node.left = insert(node.left, val)
	}

	return node
}

func inOrderPrint(node *BinaryNode) {
	if node == nil {
		return
	}

	inOrderPrint(node.left)
	fmt.Println(node.val)
	inOrderPrint(node.right)

}

func search(node *BinaryNode, needle int) bool {
	if node == nil {
		return false
	}
	if node.val == needle {
		return true
	}

	if node.val < needle {
		return search(node.right, needle)
	}

	return search(node.left, needle)

}

func main() {

	insertArray := []int{5, 4, 3, 2, 1}

	var root *BinaryNode
	for _, v := range insertArray {
		root = insert(root, v)
	}

	fmt.Println(search(root, 3))

}
