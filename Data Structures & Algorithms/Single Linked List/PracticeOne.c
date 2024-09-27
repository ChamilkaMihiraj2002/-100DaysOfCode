#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node * link;
};

struct node * head = NULL;
struct node * temp = NULL;

void display();
void insert_begin();
void insert_end();

int main() {
    int number;
    while (1)
    {
        printf("Insert Beging {1}    Insert End {2}     Display   {3}      Exit    {4}\n");
        printf("Enter number :: ");
        scanf("%d", &number);

        switch (number)
        {
        case 1:
            insert_begin();
            break;
        case 2:
            insert_end();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(1);
            break;
        default:
            break;
        }
    }
    

    display();
}

void display() {
    if (head == NULL)
    {
        printf("Linkend List is empty !!!");
        exit(1);
    }

    struct node * ptr = NULL; ptr = head;
    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");
}

void insert_begin() {
    temp = (struct node *) malloc (sizeof(struct node));
    printf("Enter node data :: ");
    scanf("%d", &temp->data);
    temp->link = NULL;

    temp->link = head;
    head = temp;

}

void insert_end() {
    temp = (struct node *) malloc (sizeof(struct node));
    printf("Enter node data :: ");
    scanf("%d", &temp->data);
    temp->link = NULL;

    if (head == NULL)
    {
       head = temp;
    } else {
        struct node * ptr = head;
        while (ptr->link != NULL)
        {
            ptr = ptr->link;
        }
        ptr->link = temp;
    }
}