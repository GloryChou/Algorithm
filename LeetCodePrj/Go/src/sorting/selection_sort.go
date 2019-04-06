package sorting

func SelectionSort(arr []int) []int {
	for i := range arr {
		min := i
		for j := i + 1; j < len(arr); j++ {
			if arr[j] < arr[min] {
				min = j
			}
		}
		tmp := arr[min]
		arr[min] = arr[i]
		arr[i] = tmp
	}

	return arr
}
