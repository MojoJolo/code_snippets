def fibIter(n):
  if n < 2:
    return n

  fPrev = 1
  fib = 1

  for num in xrange(2, n):
    fPrev, fib = fib, fib + fPrev

  return fib

def fib(n):
  if n < 2:
    return n
  else:
    return fib(n - 1) + fib(n - 2)

print fibIter(8)