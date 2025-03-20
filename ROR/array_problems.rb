# 1.Write a Ruby method to check if a given number is prime.

  def prime?(num)
    return false if num < 2
    (2..Math.sqrt(num)).each do |i|
      return false if num % i == 0
    end
    true
  end
  
  num = 33
  # puts "The number #{num} is prime? #{prime?(num)}"
  
  # 2.Write a Ruby method to reverse a string without using the built-in reverse method.
  def reverse_string(string)
      rev = ""
      string.each_char do |s|
          rev  = s + rev
      end
      rev
  end
  string = "parrot"
  # puts reverse_string(string)
  
  # 3.Write a Ruby method to check if two strings are anagrams of each other.
  def anagram_check(a, b)
      a.downcase.chars.sort == b.downcase.chars.sort
  end
  a = "momo"
  b = "fomo"
  # puts anagram_check(a, b)
  
  # 4.Write a Ruby method to find the factorial of a given number.
  
  
  def factorial(num)
      fact =1
      for i in 1..num
          fact *= i
      end
      fact
  end
  # puts factorial(3)

# binary search
def bin_search(target, arr)
  low = 0
  high = arr.length - 1
   while low <= high
     mid = low + (high - low)/2
     if arr[mid] == target
         return mid
    elsif arr[mid] > target 
         high = mid - 1
    else
        low = mid + 1
    end
  end
  return "Target not found"
end

arr = [2,4,5,7,9,11]
target = 9
# puts bin_search(target, arr)

# 12.Write a Ruby method to find the sum of all even numbers in an array.

def sum_even(arr)
    sum = 0
   arr.each { |ele| sum += ele if ele % 2 == 0  }
   return sum
end

arr = [2,4,5,7,9,11]
puts sum_even(arr)


# 13.Write a Ruby method to find the common elements between two arrays.

def common(arr1, arr2)
  arr = arr2 & arr1
end
  
arr1 = [2,4,6,7,77,7,22]
arr2 = [4,6,22,33,77,34,55,2]
# puts common(arr1, arr2)

# 14.Write a Ruby method to sort an array of strings based on their lengths, from shortest to longest.

def sort_string(arr)
  arr.sort_by { |str| str.length }
end

arr = ["ee", "e", "elephant", "apple", "wwwwwwwwwwwwww"]
# puts sort_string(arr).inspect  # Output: ["e", "ee", "apple", "elephant", "wwwwwwwwwwwwww"]