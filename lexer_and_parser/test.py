class A:
  def __init__(self):
    self.a = 2

c = {}

def main():
    b = A()
    c[2] = b
    print(c[2].a)

    d = c[2]
    d.a = 3
    print(c[2].a)
  


if __name__ == '__main__':
    main()